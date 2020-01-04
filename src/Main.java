import java.util.List;

import com.hopu.dao.UserDao;
import com.hopu.model.Users;

public class Main {

	public static void main(String[] args) {
		
		UserDao dao = new UserDao();
		
		List<Users> findAll = dao.findAll();
		
		System.out.println(findAll);
		
	}
	
}
