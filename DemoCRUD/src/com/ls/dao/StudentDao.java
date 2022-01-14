
package com.ls.dao;

import java.io.IOException;
import java.util.ArrayList;


public interface StudentDao {
    public ArrayList<String> getDataFromFile(String filename) throws IOException;
    public void writeToFile(String filename,ArrayList<String> list);
    ArrayList<String>getAlLStudents() throws IOException;
}
