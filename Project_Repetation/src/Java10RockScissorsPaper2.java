import java.util.Scanner; 
public class Java10RockScissorsPaper2 { 
  public static void main(String[] args) { 
    String[] array = {"����", "����", "��"}; 
    int you = 0; 
    int com = 0; 
    String ab = new String(); 
    Scanner sc = new Scanner(System.in); 
    while (true) { 
      com = (int) (Math.random() * 3); 
      System.out.print("���ϴ� ���� �����ϼ��� (1:����, 2:����, 3:��) : "); 
      you = sc.nextInt()-1; 
      System.out.println("��ǻ�� : " + array[com]); 
      switch (you) { 
        case 0: // ���� ������ �� 
        if(com == 0){ //�ĵ� ������ 
          System.out.println("�����ϴ�."); 
          }else if(com == 1){ 
          System.out.println("�����ϴ�."); 
          }else if(com == 2){ 
          System.out.println("�̰���ϴ�"); 
       } 
       break; 
       case 1: // ���� ������ �� 
       if(com == 0){ //���� ������ 
         System.out.println("�̰���ϴ�"); 
         }else if(com == 1){ 
         System.out.println("�����ϴ�."); 
         }else if(com == 2){ 
         System.out.println("�����ϴ�."); 
      } 
      break; 
      case 2: // ���� ���� �� 
      if(com == 0){ //���� ������ 
        System.out.println("�����ϴ�."); 
        }else if(com == 1){ 
        System.out.println("�̰���ϴ�"); 
        }else if(com == 2){ 
        System.out.println("�����ϴ�."); 
     } 
     break; 
  } 
  System.out.println("-------------------------------"); 
} 
} 
} 
