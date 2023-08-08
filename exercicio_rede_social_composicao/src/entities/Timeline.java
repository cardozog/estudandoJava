package entities;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
	private List<Post> posts = new ArrayList<>();

	public Timeline() {
	}
	
	public void addPost(Post post) {
		posts.add(post);
	}
	
	public void deletePost(int idPost) {
		posts.remove(idPost);
	}
	
	public void getTimeline() {
		for (Post post: posts) {
			System.out.println(post);
		}
	}
}
