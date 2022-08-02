package com.gmail.igorfetov1997;

public class TextDocumentCreator implements Creator{
    @Override
    public Document create() {
        return new TextDocument();
    }
}
