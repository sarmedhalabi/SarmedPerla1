package Repl1;

public abstract class Tea {
	 String type;
	Tea(String type){
	    this.type=type;
	  }
	  public abstract void addSuger();
	}
class LemonTea extends Tea{
	  LemonTea(String type){
	    super(type);
	  }
	  public void addSuger(){
	    System.out.println("For "+type+" Tea we need 2 spoons of sugar");
	  }
	}
class ChaiTea extends Tea{
	  ChaiTea(String type){
	    super(type);
	  }
	  public void addSuger(){
	    System.out.println("For "+type+" Tea we need 1 spoons of sugar");
	  }
	}

