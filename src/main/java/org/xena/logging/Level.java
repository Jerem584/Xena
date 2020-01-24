/*
 *    Copyright 2016 Jonathan Beaudoin
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

package org.xena.logging;

enum Level {
	
	ALL(0),
	
	INFO(1),
	
	WARNING(2),
	ERROR(2),
	
	DEBUG(3),
	
	OFF(4);
	
	private final int value;
	
	Level(int value) {
		this.value = value;
	}
	
	public int value() {
		return value;
	}
	
	public boolean shouldLog(Level otherLevel) {
		return shouldLog(this, otherLevel);
	}
	
	public static boolean shouldLog(Level level, Level otherLevel) {
		return level.value() < otherLevel.value();
	}
	
}
