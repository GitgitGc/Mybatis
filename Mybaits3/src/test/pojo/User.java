package test.pojo;

public class User {

	private int id;
	private String name;
	private String passwdString;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswdString() {
		return passwdString;
	}
	public void setPasswdString(String passwdString) {
		this.passwdString = passwdString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passwdString="
				+ passwdString + ", age=" + age + "]";
	}
}
