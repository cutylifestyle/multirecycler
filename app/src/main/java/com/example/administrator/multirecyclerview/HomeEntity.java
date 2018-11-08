package com.example.administrator.multirecyclerview;

import java.util.List;

public class HomeEntity {

    private int ret;
    private DiscoveryColumns discoveryColumns;
    private EditorRecommendAlbums editorRecommendAlbums;
    private FocusImages focusImages;
    private String msg;
    private SpecialColumns specialColumn;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public DiscoveryColumns getDiscoveryColumns() {
        return discoveryColumns;
    }

    public void setDiscoveryColumns(DiscoveryColumns discoveryColumns) {
        this.discoveryColumns = discoveryColumns;
    }

    public EditorRecommendAlbums getEditorRecommendAlbums() {
        return editorRecommendAlbums;
    }

    public void setEditorRecommendAlbums(EditorRecommendAlbums editorRecommendAlbums) {
        this.editorRecommendAlbums = editorRecommendAlbums;
    }

    public FocusImages getFocusImages() {
        return focusImages;
    }

    public void setFocusImages(FocusImages focusImages) {
        this.focusImages = focusImages;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public SpecialColumns getSpecialColumn() {
        return specialColumn;
    }

    public void setSpecialColumn(SpecialColumns specialColumn) {
        this.specialColumn = specialColumn;
    }

    @Override
    public String toString() {
        return "HomeEntity{" +
                "ret=" + ret +
                ", discoveryColumns=" + discoveryColumns +
                ", editorRecommendAlbums=" + editorRecommendAlbums +
                ", focusImages=" + focusImages +
                ", msg='" + msg + '\'' +
                ", specialColumn=" + specialColumn +
                '}';
    }
}
