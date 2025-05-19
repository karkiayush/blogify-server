package com.karkiayush.blogifybackend.entity;


import com.karkiayush.blogifybackend.enums.AuthProviderEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(
        name = "auth_provider",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "provider_name"}),
        /*Adds an index on providerIdValue for faster lookups.
        * For eg: SELECT * FROM auth_provider WHERE provider_id_value = 'xyz';*/
        indexes = @Index(name = "idx_provider_id_value", columnList = "provider_id_value")
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "provider_id", updatable = false, nullable = false, unique = true)
    private UUID providerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    /*We've used Enum types that contain the auth providers name*/
    @Enumerated(EnumType.STRING)
    @Column(name = "provider_name", nullable = false, length = 30)
    private AuthProviderEnum providerName;

    /*In our project, we get this providerIdValue from KeyCloak where from the token we can extract the subject claim which is the providerIdValue
    *
    * if (principal instanceof KeycloakPrincipal keycloakPrincipal) {
        IDToken token = keycloakPrincipal.getKeycloakSecurityContext().getIdToken();
        return token.getSubject(); // This is the unique provider ID
    * }
    * */
    @Column(name = "provider_id_value", nullable = false)
    private String providerIdValue;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
