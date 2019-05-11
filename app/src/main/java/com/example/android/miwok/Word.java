package com.example.android.miwok;

public class Word {

    /**
     * Default trasnlation of the word
     **/
    private String mDefaultTranslation;

    /**
     * Miwok translation of the word
     **/
    private String mMiwikTranslation;

    private int mImageResourceId;

    public int getmImageResourceId() {
        return mImageResourceId;
    }


    public String getmDefaultTranslation() {

        return mDefaultTranslation;
    }

    public String getmMiwikTranslation() {
        return mMiwikTranslation;
    }


    public Word(String defaultTranslation, String miwikTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwikTranslation = miwikTranslation;

    }

    public Word(String defaultTranslation, String miwikTranslation, int ImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwikTranslation = miwikTranslation;
        mImageResourceId = ImageResourceId;

    }
}
