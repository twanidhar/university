package co.grandcircus.University.entity;
@Entity
@Table("courses")
public class Course {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String category;
	
	

}
