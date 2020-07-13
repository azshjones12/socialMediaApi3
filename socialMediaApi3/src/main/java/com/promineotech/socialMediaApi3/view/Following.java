package com.promineotech.socialMediaApi3.view;

import java.util.Set;

import com.promineotech.socialMediaApi3.entity.User;

public class Following {
	
	private Set<User> following;
	
	public Following(User user) {
		setFollowing(user.getFollowing());
	}

	public Set<User> getFollowing() {
		return following;
	}

	public void setFollowing(Set<User> following) {
		this.following = following;
	}
	

}


