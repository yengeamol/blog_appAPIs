package com.blogApp.amol.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogApp.amol.model.Like;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByUserIdAndPostId(UUID userId, UUID postId);
    Boolean existsByUserIdAndPostId(UUID userId, UUID postId);
    Long countByPostId(UUID postId);
}
