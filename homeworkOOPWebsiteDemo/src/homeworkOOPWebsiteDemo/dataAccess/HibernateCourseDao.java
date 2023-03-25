package homeworkOOPWebsiteDemo.dataAccess;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void addData() {
		System.out.println("Hibarnate ile veritabanına eklendi");
	}
	
}
