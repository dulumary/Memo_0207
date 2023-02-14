package com.marondal.memo.post.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.memo.post.dao.PostDAO;
import com.marondal.memo.post.model.Post;

@Service
public class PostBO {
	
	@Autowired
	private PostDAO postDAO;
	
	
	public int addPost(int userId, String title, String content) {
		return postDAO.insertPost(userId, title, content);
	}
	
	public List<Post> getPostList(int userId) {
		return postDAO.selectPostList(userId);
	}
	
	public Post getPost(int postId) {
		return postDAO.selectPost(postId);
	}
}
