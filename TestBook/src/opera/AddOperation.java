package opera;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOPeration {
    public void work(BookList bookList){
        System.out.println("新增图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入新增图书名字：");
        String name= scanner.nextLine();
        System.out.println("请输入新增图书作者：");
        String author=scanner.nextLine();
        System.out.println("请输入价格");
        int price=scanner.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("请输入小说类型:");
        String type=scanner2.nextLine();
        Book book=new Book(name,author,price,type);
        int currentSize= bookList.getUsedSize();
        for (int i=0;i<currentSize;i++){
            Book temp=bookList.getBook(i);
            if(temp.getName().equals(name)){//判断查找图书名字是否相同
                System.out.println("已经有这本书了");
                return;
            }
        }
        bookList.setBooks(book);
        System.out.println("新增图书成功！");
        //修改图书数量
        bookList.setUsedSize(currentSize+1);
    }
}
