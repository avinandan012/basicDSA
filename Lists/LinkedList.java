# modify this class definitionto use generics
public class LinkedList{

  protected Node start;
  protected Node end;
  public int size;

//constructors
public LinkedList(){
  start = null;
  end = null;
  size = 0;
}

public boolean isEmpty()
{
  return size==0;
}

public int getSize(){
  return size;
}
public void insertAtStart(int val){
  Node insertNode = new Node(11);
  size++;
  if(start == null){
      start = insertNode;
      end = start;
  }
  else{
    insertNode.setLink(start);
    start = insertNoder;
  }
}


public void insertAtEnd(int val){
  
}
public void insertAtPosition(int val,int position){
  
}


}
