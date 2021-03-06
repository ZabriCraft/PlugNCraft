/*
 *  Copyright (C) 2018 FALLET Nathan
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 */

package fr.zabricraft.plugnreplica.utils;

import java.util.UUID;

import org.bukkit.entity.Player;

public class ZabriPlayer {

	private UUID uuid;
	private boolean playing;
	private boolean finish;
	private int plot;

	public ZabriPlayer(Player p) {
		uuid = p.getUniqueId();
		setPlaying(false);
		setFinish(false);
		setPlot(0);
	}

	public UUID getUuid() {
		return uuid;
	}

	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public int getPlot() {
		return plot;
	}

	public void setPlot(int plot) {
		this.plot = plot;
	}

}
