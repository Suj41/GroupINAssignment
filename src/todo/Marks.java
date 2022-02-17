package todo;

public abstract   class Marks {
    private String childName;
    public String getChildName(){
        return childName;
    }
    public void setChildName(){
        this.childName=childName;
    }
    public abstract int sum();
    public String lala(){
        return "asdf";
    }
}
