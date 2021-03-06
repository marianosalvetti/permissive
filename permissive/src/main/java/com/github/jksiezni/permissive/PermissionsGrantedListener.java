/*
 *    Copyright 2016 Jakub Księżniak
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.jksiezni.permissive;

/**
 * The interface for receiving events with granted permissions.
 */
public interface PermissionsGrantedListener {

  /**
   * The method is called at the end of action, only if one or more permissions were granted.
   *
   * @param permissions    An array of granted permissions.
   * @throws SecurityException It's declared here in order to silence Android lint.
   */
  void onPermissionsGranted(String[] permissions) throws SecurityException;
}
