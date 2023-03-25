package homeworkOOPWebsiteDemo.business;

import java.util.ArrayList;

import homeworkOOPWebsiteDemo.dataAccess.ICourseDao;

import homeworkOOPWebsiteDemo.entities.Course;
import homeworkOOPWebsiteDemo.logging.ILogger;

public class CourseManager{
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ICourseDao courseDao;
	private Course course;
	private ILogger loggers[];

	public CourseManager(ArrayList<Course> courses, Course course, ICourseDao courseDao, ILogger loggers[]) {
		super();
		this.courses = courses;
		this.courseDao = courseDao;
		this.course = course;
		this.loggers = loggers;
	}

	public void add() throws Exception {
		for (Course course1 : courses) {
			if (course1.getName() == course.getName()) {
				throw new Exception("Kurs ismi daha önce kullanılmış !");
			}
		}
		if(course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan düşük olamaz !");
		}
		courseDao.addData();
		for(ILogger logger: loggers) {
			logger.log("log mesajı");
		}
		courses.add(course);
	}
}
