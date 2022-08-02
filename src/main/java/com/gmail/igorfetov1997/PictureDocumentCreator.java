package com.gmail.igorfetov1997;

public class PictureDocumentCreator implements Creator{
    @Override
    public Document create() {
        return new PictureDocument();
    }
}
