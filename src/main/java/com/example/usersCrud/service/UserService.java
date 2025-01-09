package com.example.usersCrud.service;

import com.example.usersCrud.model.User;
import com.example.usersCrud.model.Post;
import com.example.usersCrud.model.Comment;
import com.example.usersCrud.repository.UserRepository;
import com.example.usersCrud.repository.PostRepository;
import com.example.usersCrud.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public UserService(UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public User updateUser(Long id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
