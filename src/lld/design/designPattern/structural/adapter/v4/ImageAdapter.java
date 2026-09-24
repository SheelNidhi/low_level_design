package lld.design.designPattern.structural.adapter.v4;

public class ImageAdapter implements ImageViewer {
    AdnavcedImageViewer adnavcedImageViewer;
    public ImageAdapter(String imageFormat){
        if(imageFormat.equals("PNG")){
            adnavcedImageViewer = new PNGShower();
        }
        else if(imageFormat.equals("JPEG")){
            adnavcedImageViewer = new JPEGShower();
        }else {

        }
    }

    @Override
    public void show(String imageFormat, String fileName) {
        if(imageFormat.equals("PNG")){
            adnavcedImageViewer.showPNG(fileName);
        } else if(imageFormat.equals("JPEG")){
            adnavcedImageViewer.showJPEG(fileName);
        }
    }
}
