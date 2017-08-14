package com.example.jacocosubmodules.submoduleone;

import com.example.jacocosubmodules.submodule.Submodule;

public class SubOneImpl implements Submodule {
    @Override
    public String foo() {
        return "SubOneImpl";
    }
}
