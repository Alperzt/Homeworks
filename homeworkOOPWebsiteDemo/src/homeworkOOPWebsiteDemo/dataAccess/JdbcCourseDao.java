package homeworkOOPWebsiteDemo.dataAccess;


public class JdbcCourseDao implements ICourseDao{

	@Override
	public void addData() {
		System.out.println("Jdbc ile veritabanına eklendi");
	}
	
}
