package intro;

public class Method1 {
    public void GetData() {
    	System.out.println("Hello Method1");
    }
    public static void GetData1() {
    	System.out.println("Hello Method1 with static");
    }
    public String SetData() {
    	return "return method1";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetData1();
		Method1 m= new Method1();
		m.GetData();
		String name = m.SetData();
		System.out.println(name);
		Method2 m2 = new Method2();
		m2.GetData2();
		m2.GetData3();
	}

}

