package lld.design.designPattern.structural.adapter.v4;

public class PNGShower implements AdnavcedImageViewer{
    @Override
    public void showPNG(String fileName) {
        System.out.println("showing PPNG");
    }

    @Override
    public void showJPEG(String fileName) {
        System.out.println("do nothing");

    }
}
