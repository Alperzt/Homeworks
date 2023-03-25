package homeworkOOPWebsiteDemo.business;

import java.util.ArrayList;

import homeworkOOPWebsiteDemo.dataAccess.ICourseDao;
import homeworkOOPWebsiteDemo.entities.Category;



public class CategoryManager{
	private ArrayList<Category> categories = new ArrayList<Category>();
	private ICourseDao courseDao;
	private Category category;
	public CategoryManager(ArrayList<Category> categories, ICourseDao courseDao, Category category) {
		super();
		this.categories = categories;
		this.courseDao = courseDao;
		this.category = category;
	}
	
	public void add() throws Exception{
		for (Category category1: categories) {
			if(category1.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi daha önce kullanılmış");
			}
		}
		courseDao.addData();
		categories.add(category);
	}
	
}
