package org.example;
import java.util.Scanner;

public class WordManager {
        Scanner s = new Scanner(System.in);
        WordCRUD wordCRUD;

//    *** 영단어 마스터 ***
//    *******************
//    1. 모든 단어 보기
//    2. 수준별 단어 보기
//    3. 단어 검색
//    4. 단어 추가
//    5. 단어 수정
//    6. 단어 삭제
//    7. 파일 저장
//    0. 나가기
//    *******************
//    => 원하는 메뉴는?

        WordManager(){
            wordCRUD = new WordCRUD(s);
        }

    public int selectMenu(){
        System.out.print("*******************\n" +
                "1. 모든 단어 보기\n" +
                "2. 수준별 단어 보기\n" +
                "3. 단어 검색\n" +
                "4. 단어 추가\n" +
                "5. 단어 수정\n" +
                "6. 단어 삭제\n" +
                "7. 파일 저장\n" +
                "0. 나가기\n" +
                "*******************\n" +
                "=> 원하는 메뉴는? ");
        return s.nextInt();
    }
    public void start() {
        wordCRUD.loadFile();
        while (true) {
            int menu = selectMenu();
            if(menu == 0) {
                System.out.println("이제 종료하겠습니다. 다음에 또 오실거죠? 다음에 봅시다~ ");
                break;
            }
            if(menu == 1){
                wordCRUD.listAll();
            }
            else if(menu == 2) {
                wordCRUD.serchLevel();
            }
            else if(menu == 3) {
                wordCRUD.serchWord();
            }
            else if(menu == 4) {
                wordCRUD.addItem();
            }
            else if(menu == 5){ //Update
                wordCRUD.updateItem();
            }
            else if(menu == 6){ // Delete
                wordCRUD.deleteItem();
            }
            else if(menu == 7){ // Delete
                wordCRUD.saveFile();
            }
        }
    }
}
