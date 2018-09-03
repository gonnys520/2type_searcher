package org.gonnys.ui;

import org.gonnys.searcher.AbstractSearcher;

import java.util.Scanner;

public abstract class AbstractUI {

    AbstractSearcher searcher;
    Scanner scanner;

    public AbstractUI(AbstractSearcher searcher, Scanner scanner) {
        this.searcher = searcher;
        this.scanner = scanner;
    }

    public abstract void interaction();

}
