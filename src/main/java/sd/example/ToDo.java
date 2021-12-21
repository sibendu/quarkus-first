package sd.example;

import java.util.List;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class ToDo extends PanacheEntity{
	
	public String title;
	public String url;
	public boolean status;
	public int priority;
	
	public static List<ToDo> search(String word, Integer pageIndex) {
		return find("title like ?1", "%"+word+"%").list();
	}
}
