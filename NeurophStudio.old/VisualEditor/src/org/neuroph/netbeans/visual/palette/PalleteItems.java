package org.neuroph.netbeans.visual.palette;

import java.util.ArrayList;
import org.openide.nodes.Index;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author
 */
public class PalleteItems extends Index.ArrayChildren {

    private PalleteCategory category;
    private String iconSize = "24";
    private String iconSize2 = "32";
    private String[][] items = new String[][]{
        {"Layers", "org/neuroph/netbeans/visual/palette/icons/Layer" + iconSize2 + ".png", "Layer", "org.neuroph.core.Layer"},
        {"Layers", "org/neuroph/netbeans/visual/palette/icons/InputLayer" + iconSize2 + ".png", "InputLayer", "org.neuroph.nnet.comp.layer.InputLayer"},
        {"Layers", "org/neuroph/netbeans/visual/palette/icons/CompetitiveLayer" + iconSize2 + ".png", "CompetitiveLayer", "org.neuroph.nnet.comp.layer.CompetitiveLayer"},
        {"Layers","org/neuroph/netbeans/visual/palette/icons/CustomLayer" + iconSize + ".png","Custom Layer", "org.neuroph.netbeans.visual.dialogs.AddCustomLayerDialog"},
        {"Neurons", "org/neuroph/netbeans/visual/palette/icons/Neuron" + iconSize + ".png", "Neuron", "org.neuroph.core.Neuron"},
        {"Neurons", "org/neuroph/netbeans/visual/palette/icons/BiasNeuron" + iconSize + ".png", "BiasNeuron", "org.neuroph.nnet.comp.neuron.BiasNeuron"},
        {"Neurons", "org/neuroph/netbeans/visual/palette/icons/InputNeuron" + iconSize + ".png", "InputNeuron", "org.neuroph.nnet.comp.neuron.InputNeuron"},
        {"Neurons", "org/neuroph/netbeans/visual/palette/icons/InputOutputNeuron" + iconSize + ".png", "InputOutputNeuron", "org.neuroph.nnet.comp.neuron.InputOutputNeuron"},
        {"Neurons", "org/neuroph/netbeans/visual/palette/icons/DelayedNeuron" + iconSize + ".png", "DelayedNeuron", "org.neuroph.nnet.comp.neuron.DelayedNeuron"},
        {"Neurons", "org/neuroph/netbeans/visual/palette/icons/Competitive" + iconSize + ".png", "CompetitiveNeuron", "org.neuroph.nnet.comp.neuron.CompetitiveNeuron"},
        {"Neurons", "org/neuroph/netbeans/visual/palette/icons/TresholdNeuron" + iconSize + ".png", "ThresholdNeuron", "org.neuroph.nnet.comp.neuron.ThresholdNeuron"},
      
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/sintransferfunction" + iconSize + ".png", "Weighted Sum", "org.neuroph.core.input.WeightedSum"},
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer" + iconSize + ".png", "Sum", "org.neuroph.core.input.Sum"},
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/sintransferfunction" + iconSize + ".png", "Sum Sqr", "org.neuroph.core.input.SumSqr"},
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/steptransferfunction" + iconSize + ".png", "Product", "org.neuroph.core.input.Product"},
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/tanhtransferfunction" + iconSize + ".png", "Or", "org.neuroph.core.input.Or"},
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer" + iconSize + ".png", "And", "org.neuroph.core.input.And"},
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/tanhtransferfunction" + iconSize + ".png", "Min", "org.neuroph.core.input.Min"},
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer" + iconSize + ".png", "Max", "org.neuroph.core.input.Max"}, 
        {"Input Functions", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer" + iconSize + ".png", "Difference", "org.neuroph.core.input.Difference"},
                   
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/LinearTransferFunction" + iconSize + ".png", "Linear", "org.neuroph.core.transfer.Linear"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/RampTransferFunction" + iconSize + ".png", "Ramp", "org.neuroph.core.transfer.Ramp"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/SgnTransferFunction" + iconSize + ".png", "Sgn", "org.neuroph.core.transfer.Sgn"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/StepTransferFunction" + iconSize + ".png", "Step", "org.neuroph.core.transfer.Step"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/SigmoidTransferFunction" + iconSize + ".png", "Sigmoid", "org.neuroph.core.transfer.Sigmoid"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/TanhTransferFunction" + iconSize + ".png", "Tanh", "org.neuroph.core.transfer.Tanh"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/gausiantransfer" + iconSize + ".png", "Gaussian", "org.neuroph.core.transfer.Gaussian"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/SinTransferFunction" + iconSize + ".png", "Sin", "org.neuroph.core.transfer.Sin"},
        {"Transfer Functions", "org/neuroph/netbeans/visual/palette/icons/TrapezoidTransferFunction" + iconSize + ".png", "Trapezoid", "org.neuroph.core.transfer.Trapezoid"},

        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "AntiHebbian", "org.neuroph.nnet.learning.AntiHebbianLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "LMS", "org.neuroph.nnet.learning.LMS"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "Perceptron Learning", "org.neuroph.nnet.learning.PerceptronLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "BinaryDeltaRule", "org.neuroph.nnet.learning.BinaryDeltaRule"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "SigmoidDeltaRule", "org.neuroph.nnet.learning.SigmoidDeltaRule"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "BackPropagation", "org.neuroph.nnet.learning.BackPropagation"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "MomentumBackpropagation", "org.neuroph.nnet.learning.MomentumBackpropagation"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "Resilient Propagation", "org.neuroph.nnet.learning.ResilientPropagation"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "DynamicBackPropagation", "org.neuroph.nnet.learning.DynamicBackPropagation"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "SupervisedHebbian", "org.neuroph.nnet.learning.SupervisedHebbianLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "UnsupervisedHebbian", "org.neuroph.nnet.learning.UnsupervisedHebbianLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "BinaryHebbian", "org.neuroph.nnet.learning.BinaryHebbianLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "GeneralizedHebbian", "org.neuroph.nnet.learning.GeneralizedHebbianLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "Competitive Learning", "org.neuroph.nnet.learning.CompetitiveLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "Hopfield", "org.neuroph.nnet.learning.HopfieldLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "Kohonen Learning", "org.neuroph.nnet.learning.KohonenLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "Instar", "org.neuroph.nnet.learning.InstarLearning"},
        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png" + iconSize, "Outstar", "org.neuroph.nnet.learning.OutstarLearning"}, //        {"Learning Rules", "org/neuroph/netbeans/visual/palette/icons/trapezoidtransfer.png", "SimulatedAnnealing", "org.neuroph.nnet.learning.SimulatedAnnealingLearning"},
    };

    public PalleteItems(PalleteCategory Category) {
        this.category = Category;
    }

    @Override
    protected java.util.List<Node> initCollection() {
        ArrayList childrenNodes = new ArrayList(items.length);
        for (int i = 0; i < items.length; i++) {
            if (category.getName().equals(items[i][0])) {
                PalleteItem item = new PalleteItem();
                item.setCategory(items[i][0]);
                item.setIcon(items[i][1]);
                item.setTitle(items[i][2]);
                try {
                    item.setDropClass(Class.forName(items[i][3]));
                } catch (ClassNotFoundException ex) {
                    Exceptions.printStackTrace(ex);
                }
                childrenNodes.add(new PalleteItemNode(item));
            }
        }
        return childrenNodes;

    }
}