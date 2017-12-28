package net.ypresto.androidtranscoder.engine;

import android.view.Surface;

/**
 * Created by mateus on 22/12/17.
 */

public interface OutputSurface {
    Surface getSurface();
    void release();
    void awaitNewImage();
    void drawImage(long presentationTimeUs);
}
