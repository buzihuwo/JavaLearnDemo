package annotation;

public class Record {
	@Fiele_Method_Parameter_Annotation(describe = "编号", type = int.class)
	// 注释字段
	int id;
	@Fiele_Method_Parameter_Annotation(describe = "姓名", type = String.class)
	String name;

	@Constructor_Annotation()
	// 采用默认的构造函数方法
	public Record() {
	}

	@Constructor_Annotation("立即初始化构造方法")
	public Record(@Fiele_Method_Parameter_Annotation(describe = "编号", type = int.class) int id,
			@Fiele_Method_Parameter_Annotation(describe = "姓名", type = String.class) String name) {
		this.id = id;
		this.name = name;
	}

	@Fiele_Method_Parameter_Annotation(describe = "获取编号", type = int.class)
	public int getId() {
		return this.id;
	}

	@Fiele_Method_Parameter_Annotation(describe = "设置编号")
	public void setId(@Fiele_Method_Parameter_Annotation(describe = "获取编号", type = int.class) int id) {
		this.id = id;
	}

	@Fiele_Method_Parameter_Annotation(describe = "获取姓名", type = String.class)
	public String getName() {
		return this.name;
	}

	@Fiele_Method_Parameter_Annotation(describe = "设置姓名")
	public void setName(@Fiele_Method_Parameter_Annotation(describe = "获取姓名", type = String.class) String name) {
		this.name = name;
	}
}
