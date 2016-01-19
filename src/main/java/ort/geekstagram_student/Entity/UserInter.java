package ort.geekstagram_student.Entity;

import java.util.List;

public interface UserInter {
	
	 	public void addUser(UserInter userEntity);
	    public void updateUser(UserInter userEntity);
	    public UserInter getUser(int id);
	    public void deleteUser(int id);
	    public List<UserInter> getUsers();
	

}
