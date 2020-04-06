package com.company;
public class homeWork3{
  
   public static void main(String[] args) {
     SDList x, y, z;
     String a, b;
     a = "1";
     b = "1";
     x = makeSDList(a); // make list x from string a
     y = makeSDList(b); // make list y from string b
     z = x.add(y); // add list x & y and store result in list z
     x.displaySDList1(x.getHead(), "\nA:");
     y.displaySDList1(y.getHead(), "\nB:" );
     z.displaySDList("\nsum: ");
     a = "123456789012345678901234567890";
     b = "876543210987654321098765432109";
     x = makeSDList(a); // make list x from string a
     y = makeSDList(b); // make list y from string b
     z = x.add(y); // add list x & y and store result in list z
     x.displaySDList1(x.getHead(), "\nA:");
     y.displaySDList1(y.getHead(), "\nB:" );
     z.displaySDList("\nsum: ");
     a = "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
     b = "1";
     x = makeSDList(a); // make list x from string a
     y = makeSDList(b); // make list y from string b
     z = x.add(y); // add list x & y and store result in list z
     x.displaySDList1(x.getHead(), "\nA:");
     y.displaySDList1(y.getHead(), "\nB:" );
     z.displaySDList("\nsum: ");
     a = "8888888888888";
     b = "44444444444444444444444444444444444444444444444";
     x = makeSDList(a); // make list x from string a
     y = makeSDList(b); // make list y from string b
     z = x.add(y); // add list x & y and store result in list z
     x.displaySDList1(x.getHead(), "\nA:");
     y.displaySDList1(y.getHead(), "\nB:" );
     z.displaySDList("\nsum: ");
     a = "0";
     b = "0";
     x = makeSDList(a);
     y = makeSDList(b);
     z = x.add(y);
     x.displaySDList1(x.getHead(), "\nA:");
     y.displaySDList1(y.getHead(), "\nB:");
     z.displaySDList("\nsum:");
 }
   
   public static SDList makeSDList(String a) {
     SDList temp = new SDList();
       for (int i = 0; i < a.length(); i++) 
         temp.insert(a.charAt(i));
     return temp;
  }
}

class SDNode {
  
  private char  digit;
  public SDNode next; 

  public SDNode (char digit) {
    this.digit = digit;
    this.next = null;
  }
 
  public void displaySDNode() {
    System.out.print("Digit: " + this.getDigit());
  }

  public char getDigit() {
    return this.digit;
  }
}

class SDList {
  
  private SDNode head;
  
  public SDList() {
    head = null;
  }
   
  public void insert(char a) {
    SDNode temp = null;
    if (head == null) {
      head = new SDNode(a);
    }
    else {
      temp = head;
      head = new SDNode(a);
      head.next = temp;
    }  
    return;
  }
  
  public SDNode getHead() {
    return head;
  }

  public SDList add(SDList b) {   
    int sum = 0;
    int carry = 0;
    char digit;
    SDList temp = new SDList();
    SDNode aCurrent = this.head;
    SDNode bCurrent = b.head;
      while (aCurrent != null || bCurrent != null) {
        sum = checkDigit(aCurrent) + checkDigit(bCurrent) + carry;
        digit = (char)((sum % 10) + 48);
        temp.insert(digit);
        carry = sum / 10;
        if (aCurrent != null)
          aCurrent = aCurrent.next;
        if (bCurrent != null)
          bCurrent = bCurrent.next;
      }
      if (carry == 1) 
         temp.insert('1'); 
      return temp;
  }
  
  public int checkDigit(SDNode node) {
    if (node == null) {
      return 0;
    } else {
      return (node.getDigit() - 48);
    }
  }  
  
  public void displaySDList(String number) {
   System.out.print(number);
   SDNode current = head;
   while (current != null) {
     System.out.print(current.getDigit());
     current = current.next;
   }
  }
  
  public void displaySDList1(SDNode temp, String number) {
   System.out.print(number);
   if (temp == null)
     return;
   else {   
     displaySDList1(temp.next, "");
     System.out.print(temp.getDigit());
   }
  }  
 } 