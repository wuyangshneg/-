package cn.wys.pojo;
/*
 *@author:wyangsheng
 *@description:
 *@date:2020/11/26
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int  bookID;
    private String bookName;
    private  int bookCounts;
    private String detail;


}
