/*
 * Copyright (C) 2014 The Android Open Source Project
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
package com.google.android.exoplayer.dash.mpd;

import java.util.UUID;

/**
 * Represents a ContentProtection tag in an AdaptationSet.
 */
public class ContentProtection {

  /**
   * Identifies the content protection scheme.
   */
  public final String schemeUriId;

  /**
   * The UUID of the protection scheme. May be null.
   */
  public final UUID uuid;

  /**
   * Protection scheme specific data. May be null.
   */
  public final byte[] data;

  /**
   * @param schemeUriId Identifies the content protection scheme.
   * @param uuid The UUID of the protection scheme, if known. May be null.
   * @param data Protection scheme specific initialization data. May be null.
   */
  public ContentProtection(String schemeUriId, UUID uuid, byte[] data) {
    this.schemeUriId = schemeUriId;
    this.uuid = uuid;
    this.data = data;
  }

}
