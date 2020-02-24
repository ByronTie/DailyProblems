package byrontie.patterns.contructor.factory;

public class WebUiHelperFactory {

    public static WebUiHelper getWebUiHelper(DeviceTypes deviceType) {

        switch(deviceType) {
            case PHONE:
                return new PhoneWebUiHelper();

            case TABLET:
                return new TabletWebUiHelper();

            case DESKTOP:
                return new DesktopWebUiHelper();

            default:
                return null;
        }
    }
}