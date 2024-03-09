package com.homepage.cvpage.interfaces;

import com.homepage.cvpage.model.Page;

import java.util.Collection;

public interface PageService {
    Collection<Page> getPages();
    Page addPage(Page page);
}
