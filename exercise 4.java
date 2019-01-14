class parent 
	{
	   private void show() { System.out.println("Parent's show ()");}
	}

class Child extends parent
{
@Override
public void show() { System.out.println("From child show() ");}
void show() { System.out.println("Child's show()"); }
}

class Main
	public static void main(String [] args)
	{
		parent obj1 = new parent();
		obj1.show();
		

		parent obj2 = new Child();
		obj2.show();
	}
	}