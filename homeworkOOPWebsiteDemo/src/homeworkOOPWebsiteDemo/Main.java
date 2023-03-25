package homeworkOOPWebsiteDemo;

import java.util.ArrayList;

import homeworkOOPWebsiteDemo.business.CategoryManager;
import homeworkOOPWebsiteDemo.business.CourseManager;
import homeworkOOPWebsiteDemo.dataAccess.HibernateCourseDao;
import homeworkOOPWebsiteDemo.dataAccess.ICourseDao;
import homeworkOOPWebsiteDemo.entities.Category;
import homeworkOOPWebsiteDemo.entities.Course;
import homeworkOOPWebsiteDemo.entities.Instructor;
import homeworkOOPWebsiteDemo.logging.DataBaseLogger;
import homeworkOOPWebsiteDemo.logging.EmailLogger;
import homeworkOOPWebsiteDemo.logging.FileLogger;
import homeworkOOPWebsiteDemo.logging.ILogger;


public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category("programlama");
		Category category2 = new Category("Dil");
		Instructor instructor1 = new Instructor("engin demiroğ", "photo1", "description1");
		Instructor insturctor2 = new Instructor("Halit enes kalaycı","photo2", "description2");
		
		Course course1 = new Course("Yazılım Geliştirme Kampı","description3",instructor1, 0,"photo3",category1);
		Course course2 = new Course("2023 python", "description4", instructor1, 0, "photo4", category1);
		Course course3 = new Course("Java + React", "description5", insturctor2, 0, "photo5", category1);
		Course course4 = new Course("Java + React","description6",instructor1,98,"photo6",category1);
		Course course5 = new Course("Senior Yazılım", "description7", instructor1, 0, "photo7", category1);
		ICourseDao hibernateCourseDao = new HibernateCourseDao();
		
		ILogger[] loggers = {new DataBaseLogger(),new EmailLogger(),new FileLogger()};
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course2);
		courses.add(course1);
		
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(category1);
		
		CourseManager courseManager = new CourseManager(courses, course3,hibernateCourseDao,loggers);
		courseManager.add();
		System.out.println("---------------");
		CourseManager courseManager1 = new CourseManager(courses, course5, hibernateCourseDao, loggers);
		courseManager1.add();
		System.out.println("---------------");
		CategoryManager categoryManager = new CategoryManager(categories, hibernateCourseDao, category2);
		categoryManager.add();
	}

}
