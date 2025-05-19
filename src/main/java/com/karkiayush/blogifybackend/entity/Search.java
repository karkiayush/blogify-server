package com.karkiayush.blogifybackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "search")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "search_id", updatable = false, nullable = false, unique = true)
    private UUID searchId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "search_text", nullable = false, length = 100)
    private String searchText;

    @Column(name = "search_at", nullable = false)
    private LocalDateTime searchAt;

    @PrePersist
    public void onCreate() {
        searchAt = LocalDateTime.now();
    }
}
