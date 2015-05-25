# Node.java -- This file is to create a Node in a linked list 
# this is a basic 
public class Node{
 
 protected int data;
 protected Node link;
// constructors 
public Node()
{
   data = 0;
   link = null
}

public Node(int data,Node link)
{
 this.data = data;
 this.link = link;
}


//setters
public void setData(int data){
  this.data = data;
}
public void setLink(Node link){
 this.link = link;
}
//getters
public int getData(){
 return data;
}
public Node getLink(){
 return link;
}

}
