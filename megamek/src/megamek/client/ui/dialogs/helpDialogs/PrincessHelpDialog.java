/*
 * Copyright (c) 2021 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMek.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MegaMek. If not, see <http://www.gnu.org/licenses/>.
 */
package megamek.client.ui.dialogs.helpDialogs;

import java.awt.Dimension;

import javax.swing.JFrame;

import megamek.client.ui.Messages;

public class PrincessHelpDialog extends AbstractHelpDialog {
    
    public PrincessHelpDialog(final JFrame frame) {
        super(frame, "BoardEditorHelpDialog3", Messages.getString("BotConfigDialog.princessHelpPath"));
        // keep it from being zero-sized when first opened by a player:
        setMinimumSize(new Dimension(400, 400));
        // The BotConfigDialog is modal and would block this non-modal help window, therfore unblock it:
        setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
    }
}
