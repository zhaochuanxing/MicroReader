package name.caiyao.microreader.ui.iView;

/**
 * Created by 蔡小木 on 2016/4/26 0026.
 */
public interface IBaseFragment  {
    void showProgressDialog();

    void hidProgressDialog();

    void showError(String error);
}
