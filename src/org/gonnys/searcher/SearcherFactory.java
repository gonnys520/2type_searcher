package org.gonnys.searcher;

import java.util.HashMap;
import java.util.Map;

public class SearcherFactory {

    Map<String, AbstractSearcher> map;

    public SearcherFactory()throws  Exception{
        map = new HashMap<>();
        map.put("A", new ASearcher());
        map.put("N", new NSearcher());
    }

    public AbstractSearcher find(String str){
        return map.get(str);
    }
}
