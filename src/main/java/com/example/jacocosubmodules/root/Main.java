package com.example.jacocosubmodules.root;

import com.example.jacocosubmodules.submodule.Submodule;
import com.example.jacocosubmodules.submoduleone.SubOneImpl;
import com.example.jacocosubmodules.submoduletwo.SubTwoImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        Submodule one = new SubOneImpl();
        Submodule two = new SubTwoImpl();

        System.out.println(one.foo());
        System.out.println(two.foo());
    }
}
