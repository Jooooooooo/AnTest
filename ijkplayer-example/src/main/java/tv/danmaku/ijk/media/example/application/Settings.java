/*
 * Copyright (C) 2015 Zhang Rui <bbcallen@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tv.danmaku.ijk.media.example.application;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import tv.danmaku.ijk.media.example.R;

public class Settings {
    private Context mAppContext;
    private SharedPreferences mSharedPreferences;

    public static final int PV_PLAYER__IjkMediaPlayer = 2;

    public Settings(Context context) {
        mAppContext = context.getApplicationContext();
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mAppContext);
    }

    //백그라운드에서도 영상 재생여부 확인
    public boolean getEnableBackgroundPlay() {
        return true;
    }

    public int getPlayer() {
        return PV_PLAYER__IjkMediaPlayer;
    }

    //미디어 코덱 사용 여부
    public boolean getUsingMediaCodec() {
        return false;
    }

    public boolean getUsingMediaCodecAutoRotate() {
        return false;
    }

    public boolean getUsingOpenSLES() {
        return false;
    }

    //픽셀 포맷 설정
    public String getPixelFormat() {
        return "";
    }

    public boolean getEnableNoView() {
        return false;
    }

    public boolean getEnableSurfaceView() {
        return false;
    }

    public boolean getEnableTextureView() {
        return false;
    }

    public boolean getEnableDetachedSurfaceTextureView() {
        return false;
    }
}
