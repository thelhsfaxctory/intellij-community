// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.vcs.changes;

public interface ChangesViewPreview {
  void updatePreview(boolean fromModelRefresh);

  void setPreviewVisible(boolean isPreviewVisible);

  void setAllowExcludeFromCommit(boolean value);
}
