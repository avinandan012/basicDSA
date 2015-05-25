# modify this class definitionto use generics
public class LinkedList{

  protected Node start;
  protected Node end;
  protected int size;

//constructors
public LinkedList(){
  start = null;
  end = null;
  size =0;
}

public boolean isEmpty()
{
  return size==0;
}

}
