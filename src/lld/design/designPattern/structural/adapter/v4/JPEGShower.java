package lld.design.designPattern.structural.adapter.v4;

public class JPEGShower implements  AdnavcedImageViewer{
    @Override
    public void showPNG(String fileName) {
        System.out.println("do nothing");
    }

    @Override
    public void showJPEG(String fileName) {
        System.out.println("show JPEG");

    }
}
