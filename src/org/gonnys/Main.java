package org.gonnys;

import org.gonnys.searcher.AbstractSearcher;
import org.gonnys.searcher.SearcherFactory;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws Exception{

            Scanner scanner = new Scanner(System.in);

            System.out.println("N or A  ");

            String str = scanner.nextLine();

            SearcherFactory factory = new SearcherFactory();        // 이 부분 이해해야 이 코드를 이해한 것

            AbstractSearcher searcher = factory.find(str);          // 이 부분 이해해야 이 코드를 이해한 것 222

            System.out.println(searcher);

            searcher.search();

        }
    }

